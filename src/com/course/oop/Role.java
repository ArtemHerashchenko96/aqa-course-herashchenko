package com.course.oop;

public class Role {
    private final boolean viewAll, editAll, addAll, deleteAll;

    public Role(boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }

    public Role createRole(String roleType) {

        boolean viewAll = false;
        boolean editAll = false;
        boolean addAll = false;
        boolean deleteAll = false;


        if (roleType == "Admin") {
            viewAll = true;
            editAll = true;
            addAll = true;
            deleteAll = true;
        } else if (roleType == "Main Customer") {
            viewAll = true;
            editAll = true;
            addAll = true;
        } else if (roleType == "Customer") {
            viewAll = true;
            editAll = true;
        } else if (roleType == "Viewer") {
            viewAll = true;
        }
        return new Role(viewAll, editAll, addAll, deleteAll);
    }
    @Override
    public String toString() {
        return "Role{" +
                "viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }

    public void printRoleInfo() {
        System.out.println(toString());
    }


}
