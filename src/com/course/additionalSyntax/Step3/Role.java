package com.course.additionalSyntax.Step3;

public enum Role {
    ADMIN(true, true, true, true),
    MAIN_CUSTOMER(true, false, true, true),
    CUSTOMER(true, false, true, false),
    VIEWER(true, false, false, false);

    private final boolean viewAll;
    private final boolean editAll;
    private final boolean addAll;
    private final boolean deleteAll;

    private Role(boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }

    public boolean canViewAll() {
        return viewAll;
    }

    public boolean canEditAll() {
        return editAll;
    }

    public boolean canAddAll() {
        return addAll;
    }

    public boolean canDeleteAll() {
        return deleteAll;
    }
}
