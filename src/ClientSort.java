enum typeSorts{
    QUICKSORT,
    RADIXSORT,
    COUNTINGSORT
}
public class ClientSort {

    public Isort getSort(typeSorts typeSorts)
    {
        if(typeSorts == null)
        {
            return null;
        }
        if(typeSorts==typeSorts.QUICKSORT)
        {
            return new QuickSort();
        }
        else if(typeSorts==typeSorts.RADIXSORT)
        {
            return new RadixSort();
        }
        else if(typeSorts==typeSorts.COUNTINGSORT)
        {
            return new CountingSort();
        }
        return null;
    }

}
