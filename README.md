#### How to reproduce the bug : 

##### Start Docker :

docker-compose -f composer/docker-compose.yaml up

##### Run the test :

mvn test

The test is a loop. The test goes on google.com 2000 times (see https://github.com/SeleniumHQ/selenium/issues/9528#issuecomment-868360126).

In the file https://github.com/JulienBreton/selenium_4_bug_java.util.concurrent.TimeoutException/blob/57f3d7565eeb2fa37aa5c2f640e5c72cbb00e5db/src/test/java/julien/selenium/SeleniumTest.java you can use the parameter invocationCount to run the test many times without to relauch it by yourself.

In the file https://github.com/JulienBreton/selenium_4_bug_java.util.concurrent.TimeoutException/blob/57f3d7565eeb2fa37aa5c2f640e5c72cbb00e5db/pom.xml you can change testng_firefox.xml by testng_chrome.xml if you want to try with Chrome (same result in my case).

##### More information about the bug :

It is possible to run the test without encounter the bug.
It could be necesary to run the test many times.
For exemple in my case : Test 1 failed at i=811, Test 2 OK, Test 3 OK, Test 4 failed at i=826, Test 5 failed at i=716, Test 6 OK, Test 7 failed at i=359, Test 8 failed at i=1400, Test 9 OK, Test 10 failed at i=1549.

On my computer (it is a powerful one) I face the bug oftenly but on a VM with a basic config (1 CPU, 8 Go of RAM) I have tried several times without encounter the bug. On my computer the test is really more fast. I don't know if it can be the problem.
* If I run Docker on my computer and the maven test on my computer I encounter the bug.
* If I run Docker on my computer and the maven test on the VM I encounter the bug.
* If I run Docker on the VM and the maven test on my computer I don't have the bug.
* If I run Docker on the VM and the maven test on the VM I don't have the bug.
