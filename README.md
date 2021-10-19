#### How to reproduce the bug : 

##### Start Docker :

docker-compose -f composer/docker-compose.yaml up

##### Run the test :

mvn test

The test is a loop. It will go on google.com 1000 times (see https://github.com/SeleniumHQ/selenium/issues/9528#issuecomment-868360126).

##### More information about the bug :

It is possible to run the test without encounter the bug.
It could be necesary to run the test many times.
For exemple in my case : Test 1 failed at i=811, Test 2 OK, Test 3 OK, Test 4 failed at i=826, Test 5 failed at i=716, Test 6 OK, Test 7 failed at i=359, Test 8 failed at i=1400, Test 9 OK, Test 10 failed at i=1549.

On my computer (it is a powerful one) I face the bug oftenly but on a VM with a basic config (1 CPU, 8 Mo of RAM) I have try several times without encounter the bug. On my computer the test is really more fast. I don't know if it can be the problem.
