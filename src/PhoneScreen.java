import java.util.ArrayList;
import java.util.List;

public class PhoneScreen {
    List<Phone> phoneList;
    public void producePhone(Phone phone){
        phoneList.add(phone);
    }

    public Phone findPhone(int phone){

        for(int  i=0;i<phoneList.size();i++){
            Phone temp = phoneList.get(i);
            if(temp.getId() == phone)return temp;
        }
        return new Phone("", -1 , false);
    }

    public Phone removePhone(int phone){
        for(int  i=0;i<phoneList.size();i++){
            Phone temp = phoneList.get(i);
            if(temp.getId() == phone){
                phoneList.remove(i);
                return temp;
            }
        }
        return new Phone("", -1 , false);
    }

    public List<Phone> findTouchPhones(){
        List<Phone> list = new ArrayList<>();
        for(int  i=0;i<phoneList.size();i++){
            Phone temp = phoneList.get(i);
            if(temp.isTouchScreen()){
                list.add(temp);
            }
        }
        return list;
    }

    public boolean containsPhone(List<Phone> phones , Phone phone){
        for(Phone p : phones){
            if(p == phone)return true;
        }
        return false;
    }

    public List<Phone> removeByBrand(List<Phone> phones , String brand){
        for(int i=0;i<phones.size();i++){
            Phone temp = phones.get(i);
            if(temp.getBrand().equals(brand)){
                phones.remove(i);

            }
        }
        return phones;
    }

    public Phone findSmallestByLex(List<Phone> phones){
        Phone min = phones.get(0);
        for(int i=1;i<phones.size();i++){
            Phone temp = phones.get(i);
            if(min.getBrand().compareTo(temp.getBrand()) > 1){
                min = temp;
            }
        }

        return min;
    }

    public void swapPhones(List<Phone> phones , int i , int j){
        Phone temp = phones.get(i);
        phones.set(i , phones.get(j));
        phones.set(j , temp);

    }

    public List<Phone> sortByTouch(List<Phone> phone){

        int  l=0;
        int j = phone.size()-1;
        while(l < j){
            if(phone.get(l).isTouchScreen())l++;
            else if(!phone.get(j).isTouchScreen())j--;
            else
                swapPhones(phone , l , j);

        }
        return phone;
    }


    public List<Phone> sortByBrand(List<Phone> phone){
        for(int i=0;i<phone.size()-1;i++){
            for(int j=0;j< phone.size() - i -1;j++){
                if(phone.get(j).getBrand().compareTo(phone.get(j+1).getBrand()) > 0)  swapPhones(phone , j+1  ,j);
            }
        }
        return phone;
    }

    public List<Phone> sortByPrice(List<Phone> phone){
        for(int i=0;i<phone.size()-1;i++){
            for(int j=0;j< phone.size() - i -1;j++){
                if(phone.get(j).getPrice()> phone.get(j+1).getPrice()) swapPhones(phone , j+1  ,j);
            }
        }
        return phone;
    }


    PhoneScreen(){
        phoneList = new ArrayList<>();
    }

}
