char firstNotRepeatingCharacter(String s) {
   char[] arr = s.toCharArray();
		int count = 0;
		char temp = '_';
		if (arr.length < 2){
			return arr[0];
    		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i != j) {
					if (arr[i] == arr[j]) {
						count++;
					}
					if (count > 0) {
						break;
					}
				}
			}
			if (count == 0) {
				temp = arr[i];
				break;
			}
			count = 0;
    		}
    return temp;
}
