/*
 * Copyright 2016 Try.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package if4091ta.grader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author Try
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        // Reflection
        Class fooClass = Class.forName("IndonesianPOSTagger");
        Method fooMethod =
            fooClass.getMethod("doPOSTag", new Class[] { String.class });

        ArrayList<String[]> str =
            (ArrayList<String[]>) fooMethod.invoke(fooClass.newInstance(), "Selamat siang semua");
        
        for(int i=0; i<str.size(); i++)
            System.out.println(str.get(i)[0]+"/"+str.get(i)[1]);
    }
}
