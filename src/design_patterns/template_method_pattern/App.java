package design_patterns.template_method_pattern;

import design_patterns.template_method_pattern.teacher.JavaTeacher;
import design_patterns.template_method_pattern.teacher.PythonTeacher;
import design_patterns.template_method_pattern.teacher.Teacher;

/**
 * 템플릿 메서드 패턴
 */
public class App {
    public static void main(String[] args) {
        Teacher t1 = new JavaTeacher();
        t1.수업시작();

        System.out.println("=============");

        Teacher t2 = new PythonTeacher();
        t2.수업시작();
    }
}
