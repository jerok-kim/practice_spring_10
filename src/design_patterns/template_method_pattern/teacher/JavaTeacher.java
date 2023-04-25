package design_patterns.template_method_pattern.teacher;

public class JavaTeacher extends Teacher {

    @Override
    protected void 강의하기() {
        System.out.println("자바 강의하기");
    }
}
