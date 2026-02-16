public class TestList {
    public static void main(String[] args) {
        // Test with "committee " (committee followed by a space)
        String test = "committee ";
        List list = new List();
        
        for (int i = 0; i < test.length(); i++) {
            list.update(test.charAt(i));
        }
        
        System.out.println("List for 'committee ': " + list.toString());
        System.out.println("List size: " + list.getSize());
        
        // Calculate total characters
        int total = 0;
        for (int i = 0; i < list.getSize(); i++) {
            CharData cd = list.get(i);
            total += cd.count;
        }
        System.out.println("Total characters: " + total);
    }
}
