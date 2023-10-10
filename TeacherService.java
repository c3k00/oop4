public class TeacherService<T extends Teacher>{

    public TeacherService() {
    }
    public boolean validateTeacher(Teacher teacher){
        if (teacher.getName().length() < 2) {
            System.out.println("Имя введено неверно, введите заново!");
            return false;
        } else if (teacher.getSecondName().length() < 2) {
            System.out.println("Фамилия введена неверно, введите заново!");
            return false;
        }
        return true;
    }
}