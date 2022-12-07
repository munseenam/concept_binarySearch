import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binarySearchTest {


    static int arr1[] ={1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100};

    public static final int UNSUCCESSFUL = -1;
    public static final int last=arr1.length-1;
    binarySearch myArray = new binarySearch();
    @Test
    public void binarySearchArrayTest() {


        assertEquals(3, myArray.binarySearchArray(0, last, 7,arr1));
    }


@Test
public void testShouldReturnUnsuccessfulOnwrongkey() {



    binarySearch myArray = new binarySearch();

    assertEquals(UNSUCCESSFUL,  myArray.binarySearchArray(0,last,-1,arr1));
}
@Test
public void testShouldReturnSuccessfulOnLeftBound() {

       assertEquals(0, myArray.binarySearchArray( 0, last, 1,arr1));
      }
@Test
public void testShouldReturnSuccessfulOnRightBound() {
        assertEquals(12, myArray.binarySearchArray( 0, last, 100,arr1));
    }
    @Test
public void testShouldReturnSuccessfulOnMid() {
        assertEquals(7,  myArray.binarySearchArray( 0, last, 19,arr1));
    }


@Test
public void testShouldReturnSuccessfulOnMidGreaterThanGivenNumber() {
    assertEquals(5,  myArray.binarySearchArray(0, last, 12,arr1));
        }

@Test
public void testShouldReturnSuccessfulOnMidLesserThanGivenNumber() {
    assertEquals(10,  myArray.binarySearchArray(0, last, 69,arr1));
        }

}




