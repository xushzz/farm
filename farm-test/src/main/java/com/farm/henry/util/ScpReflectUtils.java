package com.farm.henry.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.farm.henry.pojo.Student;

public class ScpReflectUtils {
	public static Object getObjectValue(Object obj,String comparedProperty){
		if(null!=obj && obj instanceof Student){
			try{
				Class<?> aClass = obj.getClass();
	            Field declaredField = aClass.getDeclaredField(comparedProperty.toString());
	            declaredField.setAccessible(true);
	            PropertyDescriptor pd = new PropertyDescriptor(declaredField.getName(), aClass);
	            Method readMethod = pd.getReadMethod();

	            return readMethod.invoke(obj);
			}catch(Exception e){
				System.out.println(e);
				return null;
			}
		}
		return null;
	}
}
