# APCS-Thing
Ashley Xu
Kuszmaul
APCS
7 September 2017
Flag ReadMe
In this project, our task was to create a resizable US flag that is scaled to the proportions of the actual flag. We were also told to make the size of the flag adjustable; when you drag a corner of the flag, it will change size and automatically scale itself.
The flag that I have submitted does indeed meet the requirements. All the dimensions of my flag match the specifications mentioned on the website, and it changes size when the user drags a corner of the flag. In addition, I have included documentation according to the AP Computer Science Documentation Standards document on Schoology. 
Overall, my code is quite accurate and efficient; however, there are a few aspects I think I can improve upon. In order to calculate the position of the flag’s white stripes, I divided the length of the hoist (the height of the flag) by thirteen, since the flag has thirteen stripes - I called it “newPos”. Then, I drew a white rectangle at the coordinates 0, newPos with width 1.9*hoist and length hoist/13. Finally, I incremented “count”, which I multiplied to newPos to get the position of the next stripe. A problem with my method is that the method fillRect only takes integers; thus, when I divide for the position of the stripe, it isn’t exact, and some of the stripes aren’t of the same size as the others.
My code consists of four main parts - the red background, the white stripes, the union, and the stars. For the background, all I did was draw a red rectangle at point 0, 0 and with a hoist of however tall the window was. The stripes were a bit more tricky; I had the aforementioned variables newPos and count, which I used to position each stripe. The union was also pretty simple; I drew a rectangle at point 0, 0 and scaled it so that its width was 19/25 of the hoist and its length was 7/13 of the hoist. The stars were much trickier; I first created a method that uses fillPolygon to draw each individual star, and used a for loop to place them on the union. For the first four rows of stars, I drew 10 stars in each row; depending on if the row number is even or odd, I would draw the first star of the row on a certain coordinate and put either five or six stars after it.
A major challenge I faced whilst writing my code was creating the stars. I couldn’t figure out the math and logistics of each star, but after asking a few of my peers, I eventually figured it out. Another tough challenge to overcome was the placing of the stars on the union. Although it was nearly was hard and I could figure it out on my own, it still took me a bit of time compared to everything else.
I would like to thank Anuva and Elaine for their help. They taught me how to draw the star and walked me through the math. I also used StackOverflow to answer some short questions or doubts I had. 
