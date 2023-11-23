package com.example.qltv_api_testing.Service;

public class MyService {
    public String buildCondition(Object... args) {
        StringBuilder condition = new StringBuilder();
        for (int i = 0; i < args.length; i += 2) {
            String key = (String) args[i];
            Object value = args[i + 1];

            if (value == null)
                continue;
            condition.append(key).append(" = ");
            if (value instanceof Number) {
                condition.append(value).append(" AND ");
            } else {
                condition.append("'").append(value).append("' AND ");
            }
        }
        if (condition.isEmpty())
            return "1 = 1";
        condition.setLength(condition.length() - 5);
        return condition.toString();
    }
}
