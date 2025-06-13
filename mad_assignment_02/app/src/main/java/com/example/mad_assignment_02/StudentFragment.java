package com.example.mad_assignment_02;

public class StudentFragment extends BaseTableFragment {
    @Override
    protected String getApiEndpoint() {
        return "/student";
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"sid", "sname", "semail", "address"};
    }
}
