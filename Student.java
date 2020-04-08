class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>();
	//TODO constructor
	public Student(){}
	//TODO seters & getters
	public String getIndex(){
return index;}
	public String getfirstName () {
return firstName;}
	public String getlastName () {
return lastName;}
	public void setIndex(string Index) {
this.index=Index;}
	public void setfirstName(string FirstName){
this.firstName=FirstName;}
	public void setlastName(string LastName){
this.lastName=LastName;}
	public double getAverage() {
		//TODO
double avg=0.0;
int sum=0; 
	for(int i=0;i<labPoints.length;i++)
{
sum+=labPoints[i];
}
avg=sum/labPoints.length;
return avg;

	}

	public boolean hasSignature() {
		//TODO
int counter=0;
for(int i=0;i<labPoints.length;i++){
if(labPoints[i]>0)
{
counter++;
}
if(counter>8)
{
return true;
}
return false;
}
	}
}
