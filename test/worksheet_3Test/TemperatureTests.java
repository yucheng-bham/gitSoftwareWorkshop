package worksheet_3Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import worksheet_3.Temperature;

/**
 * @author Alexandros Evangelidis
 * @version 2019-10-28
 */
public class TemperatureTests {

	public static final double TOLERANCE = 0.0000000001;

	@Test
	public void test1() {
		double[] temperatures = { -334.71, 191.10, 396.43, -29.51, -154.05, 357.63, 41.42, 103.22, 275.01, 22.80, 48.23,
				80.56, 233.28, 11.32, 155.11, -85.16, 262.49, 64.64, 112.40, -62.19, -29.04, 53.75, 196.32, 104.93,
				-116.61, 351.53, 145.89, -51.23, -74.15, -119.66, -147.81, -183.68, 324.85, 218.08, -54.69, 26.61,
				-175.43, -167.36, 209.21, -93.37, 321.02, 19.69, 308.81, 102.55, 274.65, 43.21, 235.59, 122.05, 195.09,
				120.43, -30.56, 140.67, 292.05, 54.76, 114.63, -99.33, 255.81, 300.35, -103.91, -153.94, 68.88, 41.07,
				-100.10, 70.36, 357.18, -115.66, -91.79, 206.10, 264.68, -193.10, 113.40, -144.08, 379.83, 244.88,
				300.32, 154.67, 55.07, 294.29, 257.90, -39.60, 342.75, 81.28, 322.33, 399.30, -78.84, -127.39, 364.42,
				-164.58, 203.86, -172.64, -88.02, 200.88, 313.48, 39.67, 46.02, 205.33, 158.11, -109.70, -174.73, 45.97,
				73.89, -88.78, -121.05, -139.95, -8.29, 372.68, 261.08, -98.56, -150.77, -173.73, -117.72, -118.50,
				-199.04, -119.67, 26.12, 291.29, 280.06, 345.44, 217.12, -181.68, 334.44, 168.12, 236.15, 385.55,
				-101.64, -130.17, 376.47, -126.15, 167.01, 126.16, -100.23, 41.09, 217.58, 257.61, -113.16, -77.77,
				264.35, -41.34, 280.64, 284.11, -151.31, -34.22, 92.72, 117.28, 246.44, -42.07, 284.45, -125.76,
				-174.10, -5.55, 145.02, 209.28, 208.87, 25.72, 66.58, 140.08, -124.49, 60.83, 264.46, 234.20, -89.80,
				244.30, 206.59, -174.00, 311.62, 380.51, 301.20, -9.50, -115.69, -50.34, 145.65, 240.00, 392.17, -16.84,
				361.61, 268.11, 186.13, 109.12, 333.02, 342.59, 318.99, 40.13, 223.41, -55.38, -170.62, 155.74, 77.56,
				-33.53, -184.56, -168.78, -189.79, 13.34, 124.98, 381.78, 50.56, 106.76, 165.19, 128.03, 146.50, -41.68,
				278.62, 143.75, -64.22, 171.86, -54.21, 121.11, 164.36, 240.84, 156.21, 281.09, -127.08, 34.49, 40.55,
				-31.52, -117.28, 212.59, 75.65, 301.20, 90.60, -126.97, 62.46, 192.55, 230.51, 120.05, 233.68, 232.79,
				-125.09, -57.21, 273.52, 103.10, 134.67, -184.85, 126.25, -199.85, 169.59, 167.18, -166.62, -26.55,
				44.08, 136.92, 271.15, 320.63, -145.93, 188.59, 360.53, -152.79, 210.65, -120.99, 291.32, -122.45,
				-104.70, 68.77, -60.04, 3.06, 198.45, 7.97, 167.65, 71.08, 319.59, 178.69, 60.68, -145.25, 242.24,
				-52.94, 219.64, 199.25, 300.44, 167.54, 116.72, 13.76, -173.76, 290.47, 322.69, -128.41, -191.40, 50.88,
				-144.69, 391.93, -195.65, 62.82, 220.52, 7.58, 220.27, 7.67, 305.71, -28.60, 133.01, 188.72, -58.69,
				122.46, 229.76, -173.92, -127.65, -180.73, -162.48, 387.26, 76.24, 152.51, 362.43, 287.94, -174.15,
				274.20, -16.74, 256.38, 28.94, 222.35, 134.26, -68.41, -24.44, 182.41, 372.58, -138.31, 294.40, 306.43,
				254.03, -16.92, 257.08, 210.34, 38.74, 94.96, -23.84, 87.26, 214.12, 395.47, 118.59, -188.58, 357.72,
				216.76, 100.04, 62.48, 366.21, 86.14, 339.31, 374.10, 149.22, 348.37, 33.30, 303.28, 327.83, 211.95,
				63.92, 228.74, -112.19, 27.59, 267.65, 16.52, 115.89, -128.00, -13.67, 340.51, -104.59, 293.52, 374.81,
				12.77, 353.35, 178.02, -33.40, 65.69, 336.12, 114.90, 293.05, 132.70, -155.02, 381.98, -85.58 };
		
		double expectedColdest = 1;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}

	@Test
	public void test2() {
		double[] temperatures = { 116.97, 188.78, -94.95, -4.62, 352.90, 188.92, 330.08, 198.06, 305.96, -148.58,
				-197.88, -168.05, 181.44, 324.51, -159.51, 3.80, -91.36, 231.15, 78.26, 378.30, -67.40, -72.98, -142.25,
				54.75, 253.20, -94.42, 341.94, 155.78, 150.75, 54.97, 127.49, 394.15, 303.54, 5.32, 133.64, 215.01,
				263.99, 283.18, 24.11, 85.50, -85.53, -188.60, 395.33, -77.71, 171.72, 258.15, 34.57, -90.02, 251.51,
				48.08, 115.26, 69.24, 240.13, 301.46, 54.58, 83.46, 149.42, 363.86, 309.68, 286.15, 54.87, -70.77,
				-166.11, 148.75, -66.33, -156.21, 53.40, 89.47, 29.93, -94.54, -142.63, -51.48, 379.18, -54.06, 20.65,
				-156.02, -77.80, 397.38, -101.26, 134.28, 230.41, -194.91, 348.18, -129.99, -149.29, -49.31, -166.58,
				216.97, 57.12, 396.49, 182.24, 276.30, -30.07, 152.69, 247.49, 114.69, -30.04, 2.84, -178.92, 48.82,
				-103.76, 1.22, -70.69, -97.20, -129.87, 177.22, -85.16, 76.18, 336.82, 147.45, 80.52, -177.83, 257.37,
				145.23, 134.45, -58.02, -79.78, 130.46, 33.21, 350.79, -29.64, 338.98, -128.76, 64.61, 177.80, 71.53,
				10.02, -105.63, -16.02, -93.81, 79.06, -85.03, -24.77, -153.77, 213.66, -198.68, 337.39, 187.20, 120.58,
				-7.41, -156.72, 302.08, 82.91, 157.58, 217.36, -97.08, -170.50, 390.59, 207.17, -159.98, -98.53, -33.16,
				-29.07, 346.64, 350.34, 329.96, -136.31, 227.36, -103.35, -128.46, 371.71, 22.74, -132.35, 193.66, 5.15,
				260.45, -85.53, 320.14, 13.95, 325.22, 286.21, -59.08, 39.70, -155.16, -92.04, 236.11, 258.73, 199.06,
				274.07, -67.62, -193.14, 10.99, -174.69, 194.24, 306.29, -122.75, 30.03, 146.28, 137.80, 133.53, 34.65,
				-140.50, -81.04, 336.67, 87.39, -83.54, -140.61, 371.88, -27.83, -5.87, -131.29, 265.66, 15.59, -127.59,
				91.33, 100.47, 50.27, 288.33, -66.38, 286.16, 31.59, 111.95, -164.46, 46.23, 12.49, 20.06, -182.51,
				323.66, 282.48, 186.98, 7.05, -198.48, 271.88, 299.36, 116.83, 167.60, -88.63, 32.78, 205.61, -69.58,
				319.63, 202.73, 9.38, 215.48, -32.12, -78.70, 277.17, 36.28, -159.40, 252.96, -111.58, 143.45, -24.62,
				68.99, 264.61, -91.35, -77.50, -149.97, -82.88, -3.60, 316.30, 79.50, 296.75, 217.32, 95.36, 8.28,
				27.09, -59.35, -52.49, 351.81, 314.98, -28.25, 288.21, 105.65, -164.61, -128.06, 107.34, -65.67, 286.71,
				113.54, 139.40, 300.16, 104.16, 221.99, 226.04, -144.76, -95.21, -39.83, 247.59, -180.71, 317.21, 56.33,
				1.36, 109.75, -77.78, 367.80, -100.14, 77.71, 297.65, 106.60, 150.89, 234.57, 221.34, 31.21, 363.81,
				128.67, 140.85, -69.86, -96.85, 350.21, 66.59, 288.78, 180.35, 304.72, 86.97, 139.80, 238.72, 301.48,
				140.31, 350.50, 243.84, 53.17, 307.19, 397.19, -156.42, 76.65, 110.57, -182.98, 6.40, 121.64, 127.97,
				212.00, 286.05, 35.88, 30.35, 307.64, -107.04, 199.33, -32.51, 140.64, -120.80, 229.18, 217.26, -34.78,
				-36.04, 69.38, -191.49, -73.02, 240.40, 34.54, -186.91, -43.92, 12.21, -122.12, 181.79, -121.71, -90.22,
				96.58, 372.30, 232.69, -169.17, 74.82, 384.49, -80.74, -60.73, 296.33, -21.29, 377.26, 338.81, -67.31,
				207.55, -82.87, 313.91, 232.42, -539.69 };

		double expectedColdest = 365;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}

	@Test
	public void test3() {
		double[] temperatures = { -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45,
				-54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6,
				64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, 21,
				-54, 15, -41, 2, 6, 64, -13, 9, -32, 54, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6,
				64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32,
				-45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41,
				2, 6, 64, -13, 9, -32, 45, -54, 15, -41, 2, 6, 64, -13, 9, -32, 45, -54, 15, -41, 2, 6, 64, -13, 9, -32,
				21, -54, 15, -41, 2, 6, 64, -13, 9, -32, 54, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2,
				6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, -164, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9,
				-32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15,
				-41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13,
				9, -32, 21, -54, 15, -41, 2, 6, 64, -13, 9, -32, 54, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15,
				-41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13,
				9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54,
				15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -43, 0, 43, -222, -222 };
		
		double expectedColdest = 364;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}

	@Test
	public void test4() {
		double[] temperatures = { -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -454, 15, -41, 2, 6, 64, -13, 9, -32, -45,
				-54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6,
				64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -454, -54, 15, -41, 2, 6, 64, -13, 9, -32,
				21, -54, 15, -41, 2, 6, 64, -13, 9, -32, 54, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2,
				6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32,
				-45, -54, 15, -41, 2, 6, 64, -454, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41,
				2, 6, 64, -13, 9, -32, 45, -54, 15, -41, 2, 6, 64, -13, 9, -32, 45, -54, 15, -41, 2, 6, 64, -13, 9, -32,
				21, -54, 15, -41, 2, 6, 64, -13, 9, -32, 54, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2,
				6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, -1, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32,
				-45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41,
				2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9,
				-32, 21, -54, 15, -41, 2, 6, 64, -13, 9, -32, 54, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15,
				-41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13,
				9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -54,
				15, -41, 2, 6, 64, -13, 9, -32, -45, -54, 15, -41, 2, 6, 64, -13, 9, -32, -45, -43, 0, 43, 2, -111 };

		double expectedColdest = 11;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}

	@Test
	public void test5() {
		double[] temperatures = { -296.67, -119.69, -153.49, -207.38, -175.21, -372.48, -251.45, -300.14, -291.68,
				-273.49, -316.18, -287.76, -153.39, -384.76, -125.83, -249.79, -332.14, -256.27, -199.06, -369.01,
				-182.42, -120.68, -290.66, -367.56, -115.02, -160.45, -105.13, -247.18, -182.26, -256.82, -341.21,
				-320.29, -239.27, -210.89, -289.73, -263.68, -381.41, -160.62, -295.00, -274.06, -122.28, -304.34,
				-255.51, -355.72, -269.22, -181.40, -183.56, -324.59, -173.20, -353.62, -165.47, -169.95, -278.83,
				-177.34, -264.13, -275.49, -276.97, -155.33, -383.80, -364.73, -166.75, -310.06, -373.43, -302.16,
				-367.32, -125.52, -179.37, -351.45, -280.20, -163.56, -170.74, -264.34, -392.43, -272.25, -151.56,
				-250.24, -128.19, -269.01, -142.67, -155.09, -201.59, -399.24, -263.21, -360.48, -297.24, -142.10,
				-166.79, -199.16, -106.57, -259.90, -290.52, -371.47, -177.92, -364.58, -156.45, -238.66, -396.08,
				-105.55, -124.58, -163.80, -393.17, -266.70, -333.97, -368.78, -106.89, -197.39, -284.35, -376.51,
				-144.31, -392.03, -104.57, -211.70, -380.06, -175.95, -225.81, -240.77, -315.93, -251.47, -128.23,
				-141.29, -255.97, -307.47, -357.10, -305.27, -305.58, -397.98, -111.78, -196.73, -286.38, -251.22,
				-394.39, -203.70, -169.22, -378.76, -368.48, -147.79, -167.35, -216.86, -118.20, -139.83, -398.60,
				-246.36, -117.35, -199.76, -221.27, -306.09, -115.07, -290.47, -271.45, -335.62, -119.48, -250.87,
				-281.74, -357.65, -314.16, -351.82, -140.54, -237.79, -373.69, -340.02, -259.56, -139.84, -353.69,
				-179.43, -352.64, -228.73, -318.72, -347.92, -293.68, -259.69, -336.93, -297.32, -213.40, -232.59,
				-214.18, -239.30, -115.24, -182.95, -162.51, -376.58, -339.12, -327.86, -197.65, -259.17, -178.58,
				-183.97, -338.83, -308.82, -261.48, -127.21, -340.09, -121.15, -137.44, -169.73, -217.28, -324.95,
				-176.19, -287.87, -146.88, -350.46, -370.10, -247.03, -304.17, -134.56, -351.67, -334.22, -376.68,
				-169.82, -181.80, -327.05, -235.92, -286.37, -338.63, -399.15, -375.57, -340.84, -338.02, -186.43,
				-127.52, -175.12, -346.72, -315.84, -248.41, -398.98, -107.22, -128.98, -328.82, -245.34, -179.14,
				-216.67, -315.03, -344.90, -216.38, -217.17, -248.58, -267.24, -341.32, -120.89, -123.29, -280.13,
				-248.01, -167.53, -130.84, -185.33, -264.61, -117.51, -116.36, -399.87, -232.10, -129.15, -293.70,
				-364.93, -211.09, -275.39, -276.44, -380.91, -211.44, -389.34, -364.87, -387.20, -150.36, -236.83,
				-192.28, -127.50, -183.99, -375.67, -374.10, -267.83, -224.52, -176.56, -122.66, -163.06, -350.64,
				-248.46, -387.09, -100.02, -142.20, -232.53, -153.12, -180.67, -322.06, -202.92, -390.64, -346.90,
				-167.71, -240.41, -168.28, -190.18, -362.94, -325.07, -263.86, -134.04, -296.39, -328.22, -286.89,
				-224.82, -177.35, -170.49, -195.26, -117.24, -132.04, -152.80, -132.03, -195.29, -263.57, -160.24,
				-330.24, -226.02, -107.57, -184.85, -333.55, -204.09, -292.03, -212.86, -159.13, -208.34, -114.79,
				-274.03, -285.17, -358.12, -284.77, -256.75, -180.14, -326.75, -234.46, -250.84, -203.39, -242.27,
				-399.99, -292.01, -197.34, -381.47, -382.53, -346.96, -160.61, -242.14, -150.26, -295.88, -238.14,
				-260.85, -113.56, -340.62, -389.55, -228.48, -207.74, -190.93, -100.29, -344.38, -347.50, -158.64,
				-181.36, -341.46, -275.14, -320.19, -362.94, -308.92, -310.64, -391.83, -124.70, -137.62, -225.76,
				-398.21, -121.70, -213.29, -306.85};

		double expectedColdest = 329;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}
	
	@Test
	public void test6() {
		double[] temperatures = { 178.34,77.07,102.77,142.30,72.18,142.87,68.12,74.89,97.13,16.83, 0.40,177.92,53.33,115.07,126.36,89.98,103.15,181.90,92.85,97.62,
				27.18,165.80,142.50,72.46,40.85, 8.28,174.64,40.94,68.46,198.67,81.11,20.91,114.83,80.45,130.20,157.03,48.85, 7.90,187.32,66.16,
				119.35,146.80, 6.94,64.17,60.11,188.72,108.06,187.18,109.37,105.72,54.39,43.32,68.43,110.94,100.00,134.82,54.63, 9.84,133.18,175.93,
				66.03,128.39,53.04,98.64,68.00,186.25,147.80,86.01,36.70,46.74,108.34,101.92,49.73,20.13, 7.07,196.81,101.52,122.45,99.72,159.92,
				38.81,199.72,66.23,62.12,61.27,115.54,97.38,86.80,12.95,70.00,54.51,182.40, 1.85,168.71,182.84,86.02,128.60,192.97,142.14,165.93,
				79.14,135.66,33.97,109.70,42.29,62.08,50.67,145.00,49.80,31.00,149.09,21.83, 4.88,168.40,160.55, 7.56,164.27,124.70,188.96,50.70,
				69.98,66.40,19.78,54.13,88.43,53.50,165.64,65.54, 8.00,136.75,107.66,140.49,170.44,172.04,57.06,62.64,167.24,193.94,157.47,16.03,
				18.92,16.45,76.30,96.01,173.42,136.37,192.01,18.02, 9.18, 2.81,74.35,137.86, 9.10,86.51,75.85,132.05,183.63,133.38, 5.38, 3.93,
				64.22,118.83,38.37,78.56,62.92,133.20,33.42,128.90,199.48,123.11,71.21,135.92,134.28,89.57,109.18,27.02,113.64, 0.92,154.31,59.90,
				33.23,117.28,96.23,123.10,156.35,42.66,114.35,109.95,85.34,22.08,175.13,89.04,177.88,183.14,169.37,42.32,124.25,185.13,104.59,71.06,
				57.08,83.12,63.68,180.13,152.47,141.08,168.60,42.75,199.05,34.52,146.87,120.71,61.29,172.40,88.26,169.11,143.93,137.07, 0.80,90.14,
				76.25,92.64,27.40,116.78,78.18,43.86,68.49, 5.44,44.58,41.32,70.78,95.54,89.74,23.64,188.90,154.24,130.97,162.94, 3.85,66.35,
				58.52,137.39,191.36,52.31,138.15,93.06,72.89, 0.89,123.68,176.89,153.70,89.10,118.59,23.79,54.57,128.01,118.89,62.88,177.90,21.26,
				193.87,171.54,13.66,152.01,17.27,50.57,187.15,24.54,147.90,119.68,177.95,78.13,77.21,140.03,98.31,64.06,10.69,158.61, 9.22,130.15,
				30.50,139.26,173.66,193.14,98.80,196.15,199.18,95.47,104.28,77.42, 5.68,40.92,29.02,60.64,169.22,82.82,118.09,116.03,39.11,198.79,
				71.72,69.62,103.04,127.50,147.55,155.75,183.77,65.94,60.18,186.58,190.87,129.70,95.93,186.33,122.45,164.10,122.29,138.58,14.30,60.71,
				165.18,77.53,167.46,181.55,151.17,117.31,50.66,22.37,67.67,158.45,169.96,56.80,180.99,136.23,125.74,194.84,70.20,183.20,35.84,61.77,
				84.43,166.52,93.80,157.92,11.51,130.29,52.17,94.96,58.17,24.46,73.89,120.96,84.86,133.62,77.98,44.44,12.88,32.88,21.20,46.58,
				27.03,92.57,103.46,131.15,34.05};

		double expectedColdest = 11;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}

}
