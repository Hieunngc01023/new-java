

package Generic;

 class PhoneNameEntry extends KeyValue<Integer,String> {
 
   public PhoneNameEntry(Integer key, String value) {
       super(key, value);
   }
     public static void main(String[] args) {
         PhoneNameEntry pbj = new PhoneNameEntry(2,"12");
         
     }
 
}
 class KeyValue<K, V> {
 
   private K key;
   private V value;
 
   public KeyValue(K key, V value) {
       this.key = key;
       this.value = value;
   }
 
   public K getKey() {
       return key;
   }
 
   public void setKey(K key) {
       this.key = key;
   }
 
   public V getValue() {
       return value;
   }
 
   public void setValue(V value) {
       this.value = value;
   }
 
}