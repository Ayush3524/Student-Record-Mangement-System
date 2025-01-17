package com.record.student.helper.student;

import com.record.student.model.Student;

public class SgpaUpdateMessageForStudent {

    public static String getMessage(Student student, String link) {

        return
                """
                Hello,\s"""
                        + student.getName()+
                        """
                !

               Your Sgpa record has been updated. you can check on following link.
               
               """+link+"""

               We hope you're having a great day!
               

               Best regards,

               S.B. Jain Institute

               """;
    }
}
