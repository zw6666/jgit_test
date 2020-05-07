package com.example.refactor.test;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class JdtTest {
    public static void main(String[]args) {
//        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("testAddComments");
        String filePath = "/Users/zhaowei/Documents/毕设/ARMJ/jdt_test/src/main/java/com/example/refactor/test/DiamondTest.java";
        String javaContent = null;
        try {
            javaContent = getJavaContent(filePath);
        } catch (Exception e) {
            System.out.println(e);
        }
//        ICompilationUnit iCompilationUnit= JavaCore.create()
        CompilationUnit result = getCompilationUnit(javaContent);
        result.recordModifications();
//        ICompilationUnit cu=(ICompilationUnit)result;
        AST ast = result.getAST();
        result.types();
//        包名
        PackageDeclaration packageDeclaration=result.getPackage();
        System.out.println(packageDeclaration.toString());
//        引用
        List importDeclarations=result.imports();
        for(Object object:importDeclarations){
            ImportDeclaration importDeclaration = (ImportDeclaration) object;
            System.out.println(importDeclaration);
        }
        List typeDeclarations = result.types();
        for (Object object : typeDeclarations) {
            TypeDeclaration typeDeclaration = (TypeDeclaration) object;
            System.out.println(typeDeclaration.getName());
            System.out.println(typeDeclaration.getClass());

            MethodDeclaration[] methodDeclaration=typeDeclaration.getMethods();
            for(Object object1:methodDeclaration){
                MethodDeclaration methodDeclaration1=(MethodDeclaration) object1;
                List a = methodDeclaration1.modifiers();
                Block block=methodDeclaration1.getBody();
                List statements=block.statements();
                for(Object object3:statements){
                    System.out.println(object3.getClass());
                    if(object3 instanceof WhileStatement){
                        WhileStatement whileStatement=(WhileStatement)object3;
                        if(whileStatement.getBody() instanceof ExpressionStatement){
                            System.out.println("缺少{}");
                        }
                    }
                }
            }
        }
        Document doc = new Document(javaContent);
        //将当前的AST树信息重新写到javasource中
        TextEdit edits = result.rewrite(doc, null);
        try {
            edits.apply(doc);
        } catch (Exception e) {
            System.out.println(e);
        }
        javaContent=doc.get();
        System.out.println(javaContent);
        //true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
//        try{
//            FileWriter fwriter=new FileWriter("/Users/zhaowei/Documents/毕设/code/jdt_test/src/main/java/com/example/refactor/test/AAA.java");
//            fwriter.write(javaContent);
//            fwriter.flush();
//            fwriter.close();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

    }

    public static CompilationUnit getCompilationUnit(String javaContent){
        ASTParser parser=ASTParser.newParser(AST.JLS8);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setSource(javaContent.toCharArray());
        CompilationUnit result = (CompilationUnit)parser.createAST(null);
        return result;
    }

    public static String getJavaContent(String javaFilePath) throws Exception {
        FileInputStream reader = new FileInputStream(new File(javaFilePath));
        byte[]bs = new byte[reader.available()];
        reader.read(bs, 0, reader.available());
        String javaContent=new String(bs);
        return javaContent;
    }
}
