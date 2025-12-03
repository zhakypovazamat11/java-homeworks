package clean_code.practice2.behavioral.iterator;

public interface IterableCollection<T> {

  Iterator<T> createIterator();

}
