cd /tmp

# Install Retrofit and its dependencies
git clone https://github.com/joshpoll/retrofit.git
git clone https://github.com/square/okio.git
git clone https://github.com/square/okhttp.git

cd okio && mvn install
cd ../okhttp && mvn install
cd .. && mvn clean install

# Run Randoop 
java -classpath ./retrofit/target/classes:./okio/okio/target/classes:./okhttp/okhttp/target/classes:$(RANDOOP_JAR) randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60
