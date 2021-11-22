from influxdb import InfluxDBClient
import random
import time

def get_random():
    return random.randint(25, 29)

client = InfluxDBClient(host='101.42.109.18', port=8086, database='influx19069100063', username='root', password='123456')

for i in range(30):
    points = [  # 待写入数据库的点组成的列表
        {
            "measurement": "dianji",
            "tags": {
                "hostname": "server01",
            },
            "fields": {
                "dianjidianliu_i": get_random(),
                "dianjidianya_u": get_random(),
                "dianjiqianzhouwen": get_random(),
                "dianji_a_xiangraozuwendu": get_random(),
            }
        }
    ]
    client.write_points(points)
    time.sleep(1) 

for i in range(30):
    points = [  # 待写入数据库的点组成的列表
        {
            "measurement": "jiansuji",
            "tags": {
                "hostname": "server01",
            },
            "fields": {
                "jiansujizhouwen": get_random(),
            }
        }
    ]
    client.write_points(points)
    time.sleep(1) 

for i in range(30):
    points = [  # 待写入数据库的点组成的列表
        {
            "measurement": "fengjishanye",
            "tags": {
                "hostname": "server01",
            },
            "fields": {
                "fengjishanyejiaodu": get_random(),
            }
        }
    ]
    client.write_points(points)
    time.sleep(1) 
    
for i in range(10):
    points = [  # 待写入数据库的点组成的列表
        {
            "measurement": "fengjidianji",
            "tags": {
                "hostname": "server01",
            },
            "fields": {
                "dianji_a_xiangraozuwendu": get_random(),
            }
        }
    ]
    client.write_points(points)
    time.sleep(1) 
    
for i in range(30):
    points = [  # 待写入数据库的点组成的列表
        {
            "measurement": "qita",
            "tags": {
                "hostname": "server01",
            },
            "fields": {
                "runhuayouchukouyali": get_random(),
            }
        }
    ]
    client.write_points(points)
    time.sleep(1) 
     