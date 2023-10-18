package Controller;

import Service.StreamService;
import Service.StudentGroupService;
public class Controller {
    private StudentGroupService studentGroupService;
    private StreamService streamService;

    public Controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }

    public boolean delStudent(String f, String i, String o) {
        return studentGroupService.removeStudent(f, i, o);
    }

    public void sortByStudentIdOfStudentGroup(){
        studentGroupService.getSortedStudentGroup();
    }

    public void sortByNameOfStudentGroup(){
        studentGroupService.getSortedByFIOStudentGroup();
    }

    public void sortBySizeListStream(){
        streamService.sortStudentsStreamBySize();
    }
}