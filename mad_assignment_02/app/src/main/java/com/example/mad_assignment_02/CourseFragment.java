package com.example.mad_assignment_02;

public class CourseFragment extends BaseTableFragment {
    @Override
    protected String getApiEndpoint() {
        return "/course";
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"course_code", "cname"};
    }
}
