import spock.lang.Specification

class GildedRoseSpec extends Specification {

	def gildedRose

	void setup() {
		gildedRose = new GildedRose()
	}

	void "quality 0 of product foo remains 0 after updating its quality"() {
		given:
		def items = [new Item(name: "foo", sellIn: 0, quality: 0)]
		gildedRose.items = items

		when:
		gildedRose.updateQuality()

		then:
		0 == gildedRose.items[0].quality
	}

}
