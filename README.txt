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

mvn cobertura:cobertura
cd retrofit/target/site/cobertura

Then open retrofit2.Utils.html

Notice lines 75-112 are not covered.

3.
Look at the top of retrofit2.Utils.html for results.
Rerun the steps in part 2 to generate new results.

Before adding test:
Line Coverage: 0/22
Branch Coverage: 0/24

After adding test:
Line Coverage: ????
Branch Coverage: ????