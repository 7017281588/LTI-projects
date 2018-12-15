package com.lti.miscellaneous;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.lti.practise.Emp;

public class TesterAnn {
public static void main(String[] args) {
	Class e= Emp.class;
	Annotation [ ] ann=e.getAnnotations();
	for(Annotation a: ann)
	{
		System.out.println(a.toString());
	}
Method [ ] methods=e.getMethods();
for(Method m: methods)
{
	Annotation [ ] m_ann=m.getAnnotations();
	for(Annotation m_an:m_ann)
			{
				System.out.println(m_an.toString());
			}
		}
	}
}
