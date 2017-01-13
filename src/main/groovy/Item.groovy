
class Item {

    String name

    int sellIn

    int quality

   @Override
   String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}
