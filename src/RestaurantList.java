import java.util.ArrayList;

public class RestaurantList {

	private ArrayList<String> titles = new ArrayList<>();
	private ArrayList<String> descriptions = new ArrayList<>();
	
	public RestaurantList()
	{
		titles.add("Fifi's Lunch Box");
		titles.add("Rick's Smokehouse");
		titles.add("Chavas");
		titles.add("Azzip Pizza");
		titles.add("Insomnia Cookies");
		titles.add("Original Spaghetti and Sub House");
		titles.add("7th and Elm");
		titles.add("Rose Gardens");
		titles.add("Five Guys");
		titles.add("Bandanas BBQ");
		titles.add("Bev's Restaurant");
		titles.add("Bush Family Restaurant");
		titles.add("Cackleberries");
		titles.add("Cheddars");
		titles.add("Cranky's");
		titles.add("Fly IN Cafe");
		titles.add("Gingersnaps");
		titles.add("Golden Corral");
		titles.add("Grand Traverse Pie Co.");
		titles.add("Homey's Que Grill");
		titles.add("IHOP");
		titles.add("Umi Grill and Sushi Bar");
		titles.add("Kleptz's Restaurant");
		titles.add("Logan's Rib-Eye");
		titles.add("LongHorn Steakhouse");
		titles.add("Magdy's Restaurant");
		titles.add("Meadows Cafe");
		titles.add("McCalister's Deli");
		titles.add("Outback Steakhouse");
		titles.add("Oy Vey Bakery & Deli");
		titles.add("Park Avenue Diner");
		titles.add("Monical's Pizza");
		titles.add("Stables Steakhouse");
		titles.add("Mcdonalds");
		titles.add("Sunrise Family Restaurant");
		titles.add("TGI Friday's");
		titles.add("Wings Etc");
		titles.add("J Gumbo's");
		titles.add("East Star Chinese Buffet");
		titles.add("Taj Mahal");
		
		descriptions.add("Easygoing option for classic American fare made with local ingredients plus coffee & craft sodas.");
		descriptions.add("BBQ");
		descriptions.add("Hefty burritos, tacos & other Mexican fare served in a relaxed counter serve with funky decor.");
		descriptions.add("Azzip Pizza, LLC is an American restaurant chain based in Evansville, Indiana, specializing in pizza. Azzip features unique, highly customized pizzas baked in a conveyor belt oven in front of customers. Azzip Pizza offers over 16 million variations including gluten-free and vegetarian options.");
		descriptions.add("Insomnia Cookies is a chain of bakeries in the United States that specializes in delivering warm cookies. Based in New York and Philadelphia, it was started in 2003 by Seth Berkowitz, a student at the University of Pennsylvania. There are over 135 locations as of 2018.");
		descriptions.add("SPAGGGGGGHETI");
		descriptions.add("Historic corner tavern with a 2nd-floor patio dispensing cocktails, hefty burgers & pub fare.");
		descriptions.add("Only the Works");
		descriptions.add("Five Guys Enterprises LLC is an American fast casual restaurant chain focused on hamburgers, hot dogs, and French fries, and headquartered in Lorton, Virginia, an unincorporated part of Fairfax County.");
		descriptions.add("Bandana's Bar-B-Q is Southern Style BBQ - seasoned with a dry rub and cooked sauceless, then hand-cut to order straight from the smoker. All Bandana's pork, beef, chicken and ribs are specially prepared over a pit of select hardwoods to create our signature smoked flavor.");
		descriptions.add("Placeholder");
		descriptions.add("Placeholder");
		descriptions.add("Bustling restaurant offering a range of traditional breakfast & lunch dishes in a no-frills setting.");
		descriptions.add("Cheddar's Scratch Kitchen, formerly known as Cheddar's Casual Cafe, is an American restaurant brand based in Irving, Texas. Founded in 1979, the company has more than 170 locations in 28 states as of 2018");
		descriptions.add("Placeholder");
		descriptions.add("Placeholder");
		descriptions.add("Placeholder");
		descriptions.add("Golden Corral is an American restaurant chain serving breakfast, lunch and dinner, featuring a large all-you-can-eat buffet and grill offering numerous hot and cold dishes, a carving station, and their Brass Bell Bakery.");
		descriptions.add("Grand Traverse Pie Company - Traverse City. Our first Pie Shop opened in July of 1996 by company founders Mike and Denise Busley. ... We also have great lunch selections, with quiches, soups, pot pie by the slice, salads, sandwiches, and raps. We serve espresso, smoothies, and a variety of home made baked goods.");
		descriptions.add("No-nonsense hub supplying wood-smoked meat & Southern-style comfort sides in snug, rustic digs.");
		descriptions.add("IHOP is an American multinational pancake house restaurant chain that specializes in breakfast foods. It is owned by Dine Brands Global—a company formed after IHOP's purchase of Applebee's, with 99% of the restaurants run by independent franchisees.");
		descriptions.add("Modern spot offering familiar Japanese meals, sushi & cocktails in an open, spacious venue.");
		descriptions.add("Placeholder");
		descriptions.add("Family-owned steakhouse serving up prime beef, ribs & chops, plus an ample salad bar in roomy digs.");
		descriptions.add("LongHorn Steakhouse is an American casual dining restaurant chain that is owned and operated by Darden Restaurants, Inc., headquartered in Orlando, Florida. As of 2016, LongHorn Steakhouse generated $1.6 billion in sales in its 481 locations.");
		descriptions.add("Placeholder");
		descriptions.add("Placeholder");
		descriptions.add("McAlister's Deli is an American chain of fast casual restaurants founded in 1989 in Oxford, Mississippi, by retired dentist Dr. Don Newcomb. There are currently over 400 locations in 28 states, ranging from Virginia in the East to Florida in the South to Arizona in West to Michigan in the North.");
		descriptions.add("Outback Steakhouse is an Australian-themed American casual dining restaurant chain, serving American cuisine, based in Tampa, Florida. The chain has over 1,000 locations in 23 countries throughout North and South America, Asia, and Australia.");
		descriptions.add("Placeholder");
		descriptions.add("Placeholder");
		descriptions.add("Monical's Pizza is an American regional pizza chain, which, as of 2019, consists of over 40 locations in Illinois, Indiana, Missouri and Wisconsin. About half of the locations are franchised, while the others are owned by the corporation. The company was founded in 1959 by the Monical family in Tolono, Illinois");
		descriptions.add("This luxurious eatery in a renovated former stable offers aged steaks, seafood meals & cocktails.");
		descriptions.add("McDonald's Corporation is an American fast food company, founded in 1940 as a restaurant operated by Richard and Maurice McDonald, in San Bernardino, California, United States.");
		descriptions.add("Placeholder");
		descriptions.add("TGI Fridays is an American restaurant chain focusing on casual dining. The company is owned by TriArtisan Capital, a New York-based private equity firm, that purchased the company from Sentinel Partners in October 2019");
		descriptions.add("Chain pub known for chicken wings & a wide variety of sauces, with sports on TV & video games.");
		descriptions.add("Placeholder");
		descriptions.add("Spacious restaurant offering rows of Asian buffet items from sushi & noodles to crawfish & crab.");
		descriptions.add("A variety of Indian dishes are served in lunch & dinner buffets & à la carte at this casual choice.");
		
		
	}
	
	public String getDescription(String restaurantTitle)
	{
		 int index = titles.indexOf(restaurantTitle);
		 return descriptions.get(index);
	}

}
