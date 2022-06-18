# Serenity JUnit Screenplay Starter project

Get started quickly with Serenity BDD and JUnit 5 with this simple starter project. 

## Get the code

Git:

    git clone https://github.com/serenity-bdd/serenity-junit-starter.git
    cd serenity-junit-starter


Or simply [download a zip](https://github.com/serenity-bdd/serenity-junit-starter/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn clean verify

## Use Gradle

Open a command window and run:

    gradlew test 

## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

## Tailoring the project to your needs


## INSTALL INFLUXDB 
Manually installation: https://docs.influxdata.com/influxdb/v2.2/install/#manually-download-and-install
brew install influxdb

Install influxdb client:

https://docs.influxdata.com/influxdb/cloud/tools/influx-cli/#manually-download-and-install
execute: ./influx

https://docs.influxdata.com/influxdb/cloud/reference/cli/influx/config/
Create configuration:
./influx config create --config-name julianita \
  --host-url http://localhost:8086 \
  --org jmconsultant \
  --token 2wUXSYYciYpXVPR4thHhSRU627AlsfEhGt7rDpnKb9WDHQ2zAOXkLp5UCusDwN7o6GqvBTxxZ9Co3WJTyXzV1w== \
  --active
  
  Configuration is stored in : vim ~/.influxdbv2/configs
  
 Create bucket 
./influx bucket create -name test -org jmconsultant


http://localhost:8086
admin
admin123

Initial Organization name: jmconsultant
Initial bucket name: serenity-results

Add influxdb client library:
implementation 'com.influxdb:influxdb-client-java:6.1.0'


List buckets
./influx bucket list

Create a database with retention policy - 18f37ceb48d57e06 (bucket id)
./influx v1 dbrp create \
--db example-db \
--rp example-rp \
--bucket-id 18f37ceb48d57e06 \
--default

*****
### Grafana
*****
curl -O https://dl.grafana.com/enterprise/release/grafana-enterprise-8.5.3.darwin-amd64.tar.gz
tar -zxvf grafana-enterprise-8.5.3.darwin-amd64.tar.gz

default username and pass: admin


Queries samples:

Filter by field:
from(bucket: "serenity-results")
   |> range(start: -2h)
   |> filter(fn: (r) => r._measurement == "testResult" and r._field == "duration")

Filter by tag:
from(bucket: "serenity-results")
   |> range(start: -2h)
   |> filter(fn: (r) => r._measurement == "testResult" and r.result == "SUCCESS")
  
  Get all scenarios by execution id 
  from(bucket: "serenity-results")
      |> range(start: -2h)
      |> filter(fn: (r) => r._measurement == "testResult" and r.executionId == "03eda0fb-f8a2-486d-b7e4-7a87c7340e20")

Group
from(bucket: "serenity-results")
      |> range(start: -3h)
      |> filter(fn: (r) => r._measurement == "testResult" and r.executionId == "03eda0fb-f8a2-486d-b7e4-7a87c7340e20")
      |> group(columns: ["result"])

Troubleshooting:

If you get the following error in grafana:

"InfluxDB Error: Bad Request"

SQL Query:
SELECT count("duration") FROM "testResult" WHERE ("executionId" = 'a7bdf155-5aad-49ca-870e-ff7d2351b379')  GROUP BY "result"


References:
https://docs.influxdata.com/flux/v0.x/get-started/#group-by-any-column



