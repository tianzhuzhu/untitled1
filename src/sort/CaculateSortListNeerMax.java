package sort;


import java.util.*;

public class CaculateSortListNeerMax {
    public static void main(String[] args) {
        Integer[] a={1,3,5,7,9,2,4,5,6,2,3,11,22};
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int size = list.size();
        Map<Integer,Queue<Integer>> map =new HashMap<>();
        int max=list.get(size-1);
        int min=list.get(0);
        double averageSub=1.0*(max-min)/(size-1);
        for (int i = 0; i < size; i++) {
            Queue<Integer> queue =new LinkedList<>();
            map.put(i, queue);
        }
        for (int i = 0; i < size; i++) {
            Integer integer = list.get(i);
            double floor = Math.floor((list.get(i)-min) / averageSub);
            int index=(int) floor;
            map.get(index).offer(list.get(i));
        }
        List<Integer> maxandmin =new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            Queue<Integer> queue = map.get(i);
                if(!queue.isEmpty()) {
                    maxandmin.add((Integer) ((LinkedList) queue).getFirst());
                    maxandmin.add((Integer)((LinkedList) queue).getLast());
//                    System.out.println(maxandmin.toString());
                }


        }
        int maxneer=0;
        for (int i = 0; i <maxandmin.size()/2-1; i++) {
            int c=maxandmin.get((i+1)*2+1)-maxandmin.get(i*2);
            maxneer=Math.max(c,maxneer);
        }
        System.out.println(maxneer);
    }
}
