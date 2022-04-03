a() {
  let memTotal=`cat /proc/meminfo | grep MemTotal | awk '{printf "%d", $2/1024 }'`
          echo "INFO: OS total memory: "$memTotal"M"
}

java_version() {
    local local_java_version

    local IFS=$'\n'
    # remove \r for Cygwin
    local lines=$("${JAVA_HOME}"/bin/java -version 2>&1 | tr '\r' '\n')
    for line in $lines; do
      if [[ (-z $local_java_version) && ($line = *"version \""*) ]]
      then
        local ver=$(echo $line | sed -e 's/.*version "\(.*\)"\(.*\)/\1/; 1q')
        # on macOS, sed doesn't support '?'
        if [[ $ver = "1."* ]]
        then
          local_java_version=$(echo $ver | sed -e 's/1\.\([0-9]*\)\(.*\)/\1/; 1q')
        else
          local_java_version=$(echo $ver | sed -e 's/\([0-9]*\)\(.*\)/\1/; 1q')
        fi
      fi
    done
    echo "$local_java_version"
}



${java_version}


#
#
#        export JAVA_HOME=/opt/taobao/java
#        export PATH=${PATH}:${JAVA_HOME}/bin
#
#    JAVA_VERSION=$(java_version)
#    echo "INFO: java version: $JAVA_VERSION"
#
#        if [ $memTotal -le 2048 ]; then
#           SERVICE_OPTS="${SERVICE_OPTS} -Xms1536m -Xmx1536m"
#           SERVICE_OPTS="${SERVICE_OPTS} -Xmn768m"
#        else
#           SERVICE_OPTS="${SERVICE_OPTS} -Xms4g -Xmx4g"
#           SERVICE_OPTS="${SERVICE_OPTS} -Xmn2g"
#        fi
#
#
#        SERVICE_OPTS="${SERVICE_OPTS} -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=${MIDDLEWARE_LOGS}/java.hprof"
#        SERVICE_OPTS="${SERVICE_OPTS} -Djava.awt.headless=true"
#        SERVICE_OPTS="${SERVICE_OPTS} -Dsun.net.client.defaultConnectTimeout=10000"
#        SERVICE_OPTS="${SERVICE_OPTS} -Dsun.net.client.defaultReadTimeout=30000"
#        SERVICE_OPTS="${SERVICE_OPTS} -DJM.LOG.PATH=${MIDDLEWARE_LOGS}"
#        SERVICE_OPTS="${SERVICE_OPTS} -DJM.SNAPSHOT.PATH=${MIDDLEWARE_SNAPSHOTS}"
#        SERVICE_OPTS="${SERVICE_OPTS} -Dfile.encoding=${JAVA_FILE_ENCODING}"
#        SERVICE_OPTS="${SERVICE_OPTS} -Dproject.name=${APP_NAME}"
#        SERVICE_OPTS="${SERVICE_OPTS} -Dserver.port=${SERVER_PORT} -Dmanagement.port=7002 -Dmanagement.server.port=7002"