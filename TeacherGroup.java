import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{

    private final List<Teacher> teachers;
    public List<Teacher> getAll() {
        return teachers;
    }

    public TeacherGroup() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addGroup (Teacher teacher) {
        teachers.add(teacher);
    }

    public void update (Teacher teacher) {
        for (Teacher l: teachers) {
            if (l.getId() == teacher.getId()) {
                l.setName(teacher.getName());
                l.setSecondName(teacher.getSecondName());
                l.setPatronymic(teacher.getPatronymic());
                l.setDateOfBirth(teacher.getDateOfBirth());
                break;
            }
        }
    }

    public void remove (Teacher teacher) {
        for (Teacher l: teachers) {
            if (l.getId() == teacher.getId()) {
                teachers.remove(l);
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder teacher = new StringBuilder();
        for (Teacher l: teachers) {
            teacher.append(l.getId())
                    .append(" ").append(l.getSecondName())
                    .append(" ").append(l.getName())
                    .append(" ").append(l.getPatronymic())
                    .append(" ").append(l.getDateOfBirth())
                    .append("\n");
        }
        return teacher.toString();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return null;
    }
}