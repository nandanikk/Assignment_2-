package com.example.mad_assignment_02;

public class EnrollmentFragment extends BaseTableFragment {
    @Override
    protected String getApiEndpoint() {
        return "/enrollment";
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"course_code", "sid"};
    }
}
