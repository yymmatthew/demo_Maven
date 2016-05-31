

/**
 * Refactorings:
 * 
 * Extract Fields.
 * Extract Methods: initArrayOfIntegers, crossOutMultiples, putUncrossedIntegerIntoResult
 * Inline s with f.length
 * Rename f to isCrossed
 * Ensure for loop starts from 2
 * Extract Methods: crossOutMultipleOf, numberOfUncrossedIntegers, notCrossed
 * Rename methods to: uncrossIntegersUpTo
 * @author jacky
 * 
 */

public class PrimeGenerator {
	/**
	 * 
	 * @param maxValue
	 *            is the generation limit
	 * @return
	 */
	boolean[] isPrime;

	public int[] generatePrimes(int maxValue) {
		if (maxValue < 2) {
			return new int[0];
		}
		assumePrimesArrayToTrue(maxValue);
		takeOutNotPrimes(maxValue);

		return takePrimes(maxValue);


	}

	private int[] takePrimes(int maxValue) {

		int[] primes = new int[takePrimesCount()];

		for (int i = 0, j = 0; i < isPrime.length; i++) {
            if (isPrime[i])
                primes[j++] = i;
        }

		return primes;
	}

	private int takePrimesCount() {
		int count = 0;
		for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i])
                count++; // bump count
        }
		return count;
	}

	private void takeOutNotPrimes(int maxValue) {
		// get rid of known non-primes
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i < Math.sqrt(isPrime.length) + 1; i++) {
            for (int j = 2 * i; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }
	}

	private void assumePrimesArrayToTrue(int maxValue) {
		isPrime = new boolean[maxValue + 1];

		for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
	}
}
