package clean_code.practice2.creational.prototype;

class Document implements Clonable {

  String text;
  String[] images;

  public Document(String text, String[] images) {
    this.text = text;
    this.images = images;  // Поверхностное копирование ссылки на массив
  }

  @Override
  public Document clone() {
    //Глубокое копирование
    String[] imagesCopy = new String[this.images.length];
    System.arraycopy(images, 0, imagesCopy, 0, images.length);
    return new Document(this.text, imagesCopy); // Проблемы с глубоким копированием
  }
}
