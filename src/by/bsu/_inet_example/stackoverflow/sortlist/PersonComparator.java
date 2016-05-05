package by.bsu._inet_example.stackoverflow.sortlist;

import java.util.Comparator;

public enum PersonComparator implements Comparator<Person>{

    ID_SORT{
        @Override
        public int compare(Person o1, Person o2){
            return Integer.valueOf(o1.getId()).compareTo(o2.getId());
        }
    },

    NAME_SORT{
        @Override
        public int compare(Person o1, Person o2){
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Person> decending(final Comparator<Person> other){
        return new Comparator<Person>(){
            public int compare(Person o1, Person o2){
                return -1 * other.compare(o1, o2);
            }
        };
    }

    public static Comparator<Person> getComparator(final PersonComparator...multipleOptions){
        return new Comparator<Person>(){
            public int compare(Person o1, Person o2){
                for (PersonComparator option : multipleOptions){
                    int result = option.compare(o1, o2);
                    if(result != 0){
                        return result;
                    }
                }
                return 0;
            }
        };
    }
}
