import org.junit.Assert;
import org.junit.Test;


public class ClientSortTest {

    @Test
    public void getSort() {
        int[] arr1 = new int[]{2,14,5,11};
        int[] arr2 = new int[]{12,321,5,1,2};
        int[] arr3 = new int[]{12,321,41,55,12};
        ClientSort clientSort = new ClientSort();
        Isort sort1 = clientSort.getSort(typeSorts.QUICKSORT);
        sort1.sort(arr1);
        Isort sort2 = clientSort.getSort(typeSorts.COUNTINGSORT);
        sort2.sort(arr2);
        Isort sort3 = clientSort.getSort(typeSorts.RADIXSORT);
        sort3.sort(arr3);
        Assert.assertArrayEquals(new int[]{2,5,11,14}, arr1);
        Assert.assertArrayEquals(new int[]{1,2,5,12,321}, arr2);
        Assert.assertArrayEquals(new int[]{12,12,41,55,321}, arr3);
    }
}