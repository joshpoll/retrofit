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
The Utils.equals(Type a, Type b) method is not tested. To see this, either run the following on an earlier commit than the one mentioned in part 3 or run

git checkout master

and then proceed.

mvn clean cobertura:cobertura
cd retrofit/target/site/cobertura

Then open retrofit2.Utils.html

Notice lines 75-112 are not covered.

3.
Switch back to the `randoop` branch.
Commit URL: https://github.com/joshpoll/retrofit/commit/063592606b2828a4b8aab3e119b05bc3a2af899c

Look at the top of retrofit2.Utils.html for full coverage results.
Rerun the steps in part 2 on `randoop` to generate new results.

Before adding tests:
Line Coverage: 109/181
Branch Coverage: 83/162

After adding tests:
Line Coverage: 113/181
Branch Coverage: 86/162

4.
run-randoop.sh will clone Retrofit and its dependencies and install them. Then it will run Randoop. NOTE: You must have the env var `RANDOOP_JAR` point to randoop-all-4.0.3.jar.

5.
Randoop did not generate any error-revealing tests.

6.
Randoop generated 2,936 regression tests.
Randoop did not cover, e.g., retrofit2.Utils. I did not include it in myclasses.txt.

Run

mvn clean cobertura:cobertura

as before to generate coverage results.

Before Randoop regression tests:
retrofit2.Retrofit:
Line Coverage: 104/105
Branch Coverage: 41/44

retrofit2.Response:
Line Coverage: 49/51
Branch Coverage: 8/10


After Randoop regression tests:
retrofit2.Retrofit:
Line Coverage: 104/105
Branch Coverage: 41/44

retrofit2.Response:
Line Coverage: 49/51
Branch Coverage: 8/10

Randoop did not improve coverage. This is probably because the existing tests already cover these classes very thoroughly.

7.
I found Randoop much easier to use than Jacoco. The documentation is very useful and the error messages are good. I was surprised by the lack of examples available on the main site and elsewhere on the Internet, but this did not hinder my ability to use the tool much.

I think the output could be more helpful. For example, when I had error-revealing tests in another project and minimized them, some of the error-revealing tests minimized to the same exact test. I wish Randoop eliminated redundant error-revealing tests so I knew how many distinct errors it found.

I was also confused by why certain classes could be used with Randoop but others couldn't. For example retrofit2.Utils is considered a non-visible class, but I'm not sure why that is or what it means. What if Randoop enumerated all the classes I could use automatically?

I think I would probably use Randoop's ability to make error-revealing tests early in development when there are likely lots of bugs that would be easy for a computer to find, but harder for a human. I might also use it for a larger project to generate regression tests. My guess is that error-revealing tests do not often reveal useful bugs for large-scale projects, but I may be wrong.

Resources:
I mainly used https://randoop.github.io/randoop/manual/index.html
Time Spent: 8 hours
