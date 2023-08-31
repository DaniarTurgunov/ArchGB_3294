import connexion
import six

from swagger_server.models.clouds import Clouds  # noqa: E501
from swagger_server.models.error import Error  # noqa: E501
from swagger_server import util


def cancel_cloud_by_id(cloud_id):  # noqa: E501
    """Cancellation method in cloud by ID

     # noqa: E501

    :param cloud_id: identificator order in cloud
    :type cloud_id: str

    :rtype: None
    """
    return 'do some magic!'


def create_cloud(body=None):  # noqa: E501
    """Create order in cloud

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Clouds
    """
    if connexion.request.is_json:
        body = Error.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_clouds():  # noqa: E501
    """Method of getting cloud resource

     # noqa: E501


    :rtype: Clouds
    """
    return 'do some magic!'


def get_cloud_by_id(cloud_id):  # noqa: E501
    """method of getting order by ID

     # noqa: E501

    :param cloud_id: Cloud Id
    :type cloud_id: str

    :rtype: Clouds
    """
    return 'do some magic!'
