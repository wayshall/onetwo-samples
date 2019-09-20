cd ..
mvn clean package -am -Dmaven.test.skip=true -Pproduct -pl gateway -U
pause