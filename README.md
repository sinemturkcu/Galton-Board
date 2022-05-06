# GaltonBoard
The Galton board is a device for statistical experiments named after English scientist Sir Francis
Galton. It consists of an upright board with evenly spaced nails (or pegs) driven into its upper half,
where the nails are arranged in staggered order, and a lower half divided into a number of
evenly-spaced rectangular slots. The front of the device is covered with a glass cover to allow viewing
of both nails and slots. In the middle of the upper edge, there is a funnel into which balls can be
poured. The funnel is located precisely above the central nail of the second row so that each ball, if
perfectly centered, would fall vertically and directly onto the uppermost point of this nail's. Each time
a ball hits one of the nails, it can bounce right (or left) with equal probability.
<br><br><br>
![image](https://user-images.githubusercontent.com/42895382/167092814-66297dc0-9c2f-4589-9233-b57f4c21c6c6.png)
<br><br><br>
I 
considered the ball in the above figure as threads and rectangular slots as array cells.
 Also, you need an array to
count incoming threads. At any point (green circles in the figure), the thread can move either right or
left. This choice is done randomly. When the thread finished its way, increase the value of the array
cell by one. The below figure presents an example of the program output for a run. The values may
naturally change for each run. Be sure that created thread count is equal to the sum of the values.
