package config;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class GenericMapper {

    public Object getConvertedResult(Object s, Object d) throws NoSuchFieldException, IllegalAccessException {
        Field sourceFields[] = s.getClass().getDeclaredFields();
        Field destinationFields[] = d.getClass().getDeclaredFields();
        Map<Object, Object> sourceMap = new HashMap<>();
        for (Field field : sourceFields) {
            Field fs = s.getClass().getDeclaredField(field.getName());
            fs.setAccessible(true);
            sourceMap.put(field.getName(),  fs.get(s));
        }
        for (Field field : destinationFields) {
            Field fd = d.getClass().getDeclaredField(field.getName());
            fd.setAccessible(true);
            if (sourceMap.containsKey(field.getName())){
                fd.set( d, sourceMap.get(field.getName()));
            }
        }
// output of map
//        for (Map.Entry m : sourceMap.entrySet()) {
//            System.out.println(m.getKey() + " > " + m.getValue());
//        }
        return d;
    }

//    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        User u = new User();
//        u.setId("1");
//        u.setUsername("admin");
//        u.setPassword("pass");
//        u.setFullName("me");
//        var data = new GenericMapper().getConvertedResult(u, new UserViewModel());//mapstruct,broadleafCommerce,beanUtils
//        System.out.println(data);
//    }
}
