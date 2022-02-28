
var map1 = new Map(); 
map1.set("first name", "John"); 
map1.set("last name", "Khan"); 
map1.set("friend 1","Raj") 
    .set("friend 2","Sai"); 
console.log(map1); 
console.log("map1 has friend 3 ? " + map1.has("friend 3")); 
console.log("get value for key = friend 3 - "+ map1.get("friend 3")); 
console.log("delete element with key = friend 2 - " + map1.delete("friend 2")); 
map1.clear(); 
console.log(map1);
class Employee
{
    constructor(id,name)
    {
      this.id=id;
      this.name=name;
    }
    detail()
    {
  document.writeln(this.id+" "+this.name+"<br>")
    }
  }
//passing object to a variable 
var e1=new Employee(121,"Harni");
var e2=new Employee(122,"Hani");
e1.detail(); 
e2.detail();
