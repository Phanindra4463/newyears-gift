package oops.gift;

import oops.gifts.chocolates.chocolate;
import oops.gifts.chocolates.kitkat;
import oops.gifts.chocolates.munch;
import oops.gifts.chocolates.dairymilk;
import oops.gifts.sweets.kalajamun;
import oops.gifts.sweets.balusha;
import oops.gifts.sweets.kalakhand;
import oops.gifts.sweets.sweet;

public  final class database {
	public static final chocolate[] chocolates = {
			new kitkat("kitkat",10.50f,15.0f),
			new munch("munch",50.75f,13.06f),
			new dairymilk("dairymilk",60.25f,30.0f),
			
	};
	public static final sweet[] sweets = {
			new kalajamun("kalajamun",45.0f,20.5f),
			new balusha("balusha",20.0f,30),
			new kalakhand("kalakhand",10,20),
	};
	

}
