 class Events {

	 String event_manager;
	String event_place;
	String event_name;
        int  people_attend;
        int event_cost;
       


	Events( String event_manager,String event_place,String event_name,int  people_attend,int event_cost)
	{
		this.event_manager=event_manager;
                    this. event_place=event_place;
this.event_name=event_name;
                        this.people_attend=people_attend;
                       this.event_cost=event_cost;

	}
	void display() {

		System.out.println("event manager name is="+event_manager);
		System.out.println("place of event in="+event_place);
		System.out.println("event name is="+event_name);
		System.out.println("number of people attend is ="+people_attend);
		System.out.println("cost of event is="+event_cost);
		}
}
class Event
{
	public static void main(String[] args)
	{
		Events firstevent=new Events("prasad","Hyderbad","Trance",120,35000);
		firstevent.display();
		
		Events secondevent=new Events("mani","vijayawada","colours",200,45000);
		secondevent. display();
		
		
	}
}