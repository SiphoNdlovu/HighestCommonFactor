package com.company;



/**
 * @author Sipho Ndlovu
 * This class is used to find the HCF
 * of elements in an array
 */
public class Main {

    public static void main(String[] args) {

        int[] elementsToFindHCF = {8,16,20,30};
        System.out.println("----The HCF is " + highestCommonFactor(elementsToFindHCF) + "----");

    }


    /**
     * This function is used to calculate the hcf by following the
     * euclidean algorithm
     * Check <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor">euclidean algorithm</a>
     * @param elementsToMod list of elements to mod / divide with remainder
     *  to get hcf
     *
     * @return for  a list  1,2,3 this function calculates and returns gcd(1,gcd(2,3)) or
     * for a list 1,2 this function will return gcd(2,1)
     *
     */
    public static int highestCommonFactor(int[] elementsToMod) {

        int returnHCF = 0; // this will be the final result / hcf

        for (int index = 1; index < elementsToMod.length; index++) {
            //to avoid division by zero , return hcf as 1 should an element be 0
            if (elementsToMod[index] == 0) {
                returnHCF = 1;
            } else {
                //assume first element is the hcf and compare / mod with the rest of the elements in the list
                returnHCF = elementsToMod[0] % elementsToMod[index];
            }

        }
        return returnHCF;

    }
}
