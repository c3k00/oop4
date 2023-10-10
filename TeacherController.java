import java.util.Scanner;

public class TeacherController <T extends Teacher>{

    private final TeacherGroup group;
    private final TeacherService dataService;
    private final TeacherView teacherView = new TeacherView();

    public TeacherController(TeacherGroup storage, TeacherService validator) {
        this.group = storage;
        this.dataService = validator;
    }

    public void addNewTeacher() {

        System.out.print("Введите фамилию учителя -> ");
        Scanner n = new Scanner(System.in);
        String secondName = n.next();

        System.out.print("Введите имя учителя -> ");
        String firstName = n.next();

        System.out.print("Введите отчество учителя -> ");
        String patronymic = n.next();

        System.out.println("Пример ГГГГ-ММ-ДД ");
        System.out.print("Введите дату рождение учителя -> ");
        String dateOfBirth = n.next();

        int id = group.getTeachers().size() + 1;

        Teacher teacher = new Teacher(id, firstName, secondName, patronymic, dateOfBirth);
        if (!dataService.validateTeacher(teacher)) { return; }

        group.addGroup(teacher);
        System.out.println(group);
        teacherView.sendOnConsole(group.getAll());
    }

    public void upgradeTeacher() {

        System.out.println(group.toString());
        System.out.println("Введите id учителя для редактирования: ");
        Scanner n = new Scanner(System.in);
        int id = Integer.parseInt(n.next());

        for (Teacher l: group.getTeachers()) {
            if (l.getId() == id) {
                System.out.print("Введите измененную фамилию -> ");
                String secondName = n.next();

                System.out.print("Введите измененное имя -> ");
                String firstName = n.next();

                System.out.print("Введите измененное отчество -> ");
                String patronymic = n.next();

                System.out.println("Пример ГГГГ-ММ-ДД ");
                System.out.print("Введите измененную дату рождения -> ");
                String dateOfBirth = n.next();

                Teacher teacher = new Teacher(id, firstName, secondName, patronymic, dateOfBirth);
                if (!dataService.validateTeacher(teacher)) { return; }

                group.update(teacher);
                System.out.println(group);
                teacherView.sendOnConsole(group.getAll());
                return;
            }
        }
        System.out.println("Учитель с таким id не найден, повторите операцию!");
    }

    public void removeTeacher() {
        System.out.println(group.toString());
        System.out.print("Введите id учителя для удаления -> ");
        Scanner n = new Scanner(System.in);
        int id = Integer.parseInt(n.next());

        for (Teacher l: group.getTeachers()) {
            if (l.getId() == id) {
                group.remove(l);
                System.out.println(group);
                return;
            }
        }
        System.out.println("Учитель с таким id не найден, повторите операцию!");
    }
}