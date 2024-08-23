package com.cbfacademy.words;

    public class ReverseCharSequence implements CharSequence {
        private String original;
    
        public ReverseCharSequence(String original) {
            this.original = original;
        }
    
        @Override
        public int length() {
            return original.length();
        }
    
        @Override
        public char charAt(int index) {
            // To reverse the string, we get the character from the end
            int reversedIndex = original.length() - 1 - index;
            return original.charAt(reversedIndex);
        }
    
        @Override
        public CharSequence subSequence(int start, int end) {
            StringBuilder subSeq = new StringBuilder(original.subSequence(start, end));
            // Reverse the subsequence
            return subSeq.reverse().toString();
        }
    
        @Override
        public String toString() {
            // Use StringBuilder to reverse the string
            return new StringBuilder(original).reverse().toString();
        }
    
        public static void main(String[] args) {
            // Testing the ReverseCharSequence class
            ReverseCharSequence reversed = new ReverseCharSequence("Hello");
            System.out.println(reversed.toString()); // Output: "olleH"
            System.out.println(reversed.charAt(0));  // Output: 'o'
            System.out.println(reversed.subSequence(1, 4)); // Output: "lle"
            System.out.println(reversed.length()); // Output: 5
        }
    }
