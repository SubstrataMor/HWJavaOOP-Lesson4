package Date;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup> {
    private List<StudentGroup> listStudentGroup;
    private int index;

    public List<StudentGroup> getListStudentGroup() {
        return listStudentGroup;
    }

    public void setListStudentGroup(List<StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    public Stream(List<StudentGroup> studentsStream) {
        this.listStudentGroup = studentsStream;
        this.index = 0;
    }

    public Stream() {
        this.listStudentGroup = new ArrayList<>();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < listStudentGroup.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return listStudentGroup.get(index++);
    }

    @Override
    public void remove() {
        if (index >= 0 && index < listStudentGroup.size()) {
            listStudentGroup.remove(index);
        }
    }

}