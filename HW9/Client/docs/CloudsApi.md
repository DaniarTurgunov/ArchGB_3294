# swagger_client.CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_cloud_by_id**](CloudsApi.md#cancel_cloud_by_id) | **DELETE** /clouds/{cloud_id} | Cancellation method in cloud by ID
[**create_cloud**](CloudsApi.md#create_cloud) | **POST** /clouds | Create order in cloud
[**get_all_clouds**](CloudsApi.md#get_all_clouds) | **GET** /clouds | Method of getting cloud resource
[**get_cloud_by_id**](CloudsApi.md#get_cloud_by_id) | **GET** /clouds/{cloud_id} | method of getting order by ID

# **cancel_cloud_by_id**
> cancel_cloud_by_id(cloud_id)

Cancellation method in cloud by ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
cloud_id = 'cloud_id_example' # str | identificator order in cloud

try:
    # Cancellation method in cloud by ID
    api_instance.cancel_cloud_by_id(cloud_id)
except ApiException as e:
    print("Exception when calling CloudsApi->cancel_cloud_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_id** | **str**| identificator order in cloud | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_cloud**
> Clouds create_cloud(body=body)

Create order in cloud

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
body = swagger_client.Error() # Error |  (optional)

try:
    # Create order in cloud
    api_response = api_instance.create_cloud(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->create_cloud: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  | [optional] 

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: adplication/json
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_clouds**
> Clouds get_all_clouds()

Method of getting cloud resource

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()

try:
    # Method of getting cloud resource
    api_response = api_instance.get_all_clouds()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->get_all_clouds: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cloud_by_id**
> Clouds get_cloud_by_id(cloud_id)

method of getting order by ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
cloud_id = 'cloud_id_example' # str | Cloud Id

try:
    # method of getting order by ID
    api_response = api_instance.get_cloud_by_id(cloud_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->get_cloud_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_id** | **str**| Cloud Id | 

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

