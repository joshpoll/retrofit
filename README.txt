Josh Pollock
joshpoll
CSE 403: Software Engineering
Assignment 3
13 Apr 2018

1.
Fork URL: https://github.com/joshpoll/retrofit.git/
Branch:   randoop
Full URL: https://github.com/joshpoll/retrofit/tree/randoop


2.
The Utils.equals(Type a, Type b) method is not tested. To see this, run

mvn clean cobertura:cobertura
cd retrofit/target/site/cobertura

Then open retrofit2.Utils.html

Notice lines 75-112 are not covered.

3.
Look at the top of retrofit2.Utils.html for results.
Rerun the steps in part 2 to generate new results.

Before adding tests:
Line Coverage: 109/181
Branch Coverage: 83/162

After adding tests:
Line Coverage: 113/181
Branch Coverage: 86/162

4.
run-randoop.sh will clone Retrofit and its dependencies and install them. Then it will run Randoop.

5.
Randoop did not generate any error-revealing tests.

6.
Randoop generated 2,484 regression tests.
